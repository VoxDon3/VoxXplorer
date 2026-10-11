.class public final synthetic Lax/v1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/e$d;


# instance fields
.field public final synthetic a:Lax/q1/B;


# direct methods
.method public synthetic constructor <init>(Lax/q1/B;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/v1/a;->a:Lax/q1/B;

    return-void
.end method


# virtual methods
.method public final a(J)J
    .registers 4

    .line 1
    iget-object v0, p0, Lax/v1/a;->a:Lax/q1/B;

    invoke-virtual {v0, p1, p2}, Lax/q1/B;->i(J)J

    move-result-wide p1

    return-wide p1
.end method
